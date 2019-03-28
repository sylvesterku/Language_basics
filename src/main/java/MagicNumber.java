import java.io.*;
import java.util.Scanner;

public class MagicNumber {
    private String filePath;
    private int offset;
    private static final String GIF_SIGNATURE = "474946383761";
    private static final String GIF_SIGNATURE_2 = "474946383961";
    private static final String JPG_SIGNATURE = "ffd8ffdb";
    private static final String JPG_SIGNATURE_2 = "ffd8ffe0";
    private static final String JPG_SIGNATURE_3 = "ffd8ffe1";
    private static final String JPG_SIGNATURE_4 = "ffd8ffee";

    public MagicNumber(String filePath, int offset) {
        this.filePath = filePath;
        this.offset = offset;
    }

    public static void main(String[] args) throws Exception {
        String str;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the file path:");
            str = sc.nextLine();
        }
        MagicNumber magicNumber = new MagicNumber(str, 0);
        magicNumber.fileChecker();

    }

    private void fileChecker() throws Exception {
        int dotIndex = this.filePath.indexOf(".");
        String extension = this.filePath.substring(dotIndex + 1);

        switch (extension) {
            case "gif":
                System.out.println("Extension is .gif, ");
                if (this.gifCheck()) {
                    System.out.println("and it's a gif file");
                } else {
                    if (this.jpgCheck()) {
                        System.out.println("but it's a jpg file");
                    } else if (this.txtCheck()) {
                        System.out.println("but it's a text file");
                    } else {
                        System.out.println("but it's unknown file type");
                    }
                }
                break;
            case "jpg":
                System.out.println("Extension is .jpg");
                if (this.jpgCheck()) {
                    System.out.println("and it's a jpg file");
                } else {
                    if (this.gifCheck()) {
                        System.out.println("but it's a gif file");
                    } else if (this.txtCheck()) {
                        System.out.println("but it's a text file");
                    } else {
                        System.out.println("but it's unknown file type");
                    }
                }
                break;
            case "txt":
                System.out.println("Extension is .txt");
                if (this.txtCheck()) {
                    System.out.println("and it's a text file");
                } else if (this.jpgCheck()) {
                    System.out.println("but it's a jpg file");
                } else {
                    if (this.gifCheck()) {
                        System.out.println("but it's a gif file");
                    } else {
                        System.out.println("but it's unknown file type");
                    }
                }
                break;
            default:
                System.out.println("Unknown extension, ");
                if (this.gifCheck()) {
                    System.out.println("but it's a gif file");
                } else if (this.jpgCheck()) {
                    System.out.println("but it's a jpg file");
                } else {
                    System.out.println("it's unknown file type");
                }
        }
    }

    public String readBytes() {
        byte[] buffer = new byte[12];
        try {
            InputStream is = new FileInputStream(filePath);
            is.read(buffer, offset, 12);
        } catch (Exception e) {
            e.printStackTrace();
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : buffer) {
            String s = Integer.toHexString(b);
            if (s.length() > 2) {                       //problem z odczytywaniem plików .jpg dlatego brałem tylko 2 ostatnie znaki (e0 zamiast ffffffe0)
                sb.append(s.substring(s.length() - 2));
            } else {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    public boolean gifCheck() {
        if (readBytes().contains(GIF_SIGNATURE) || readBytes().contains(GIF_SIGNATURE_2)) {
            return true;
        }
        return false;
    }

    public boolean jpgCheck() {
        if (readBytes().contains(JPG_SIGNATURE) || readBytes().contains(JPG_SIGNATURE_2)
                || readBytes().contains(JPG_SIGNATURE_3) || readBytes().contains(JPG_SIGNATURE_4)) {
            return true;
        }
        return false;
    }

    public boolean txtCheck() throws Exception {        //nie ma magic number więc sprawdzałem znaki ASCII, ale działa tylko do 127,
                                                        //nie umiałem ogarnąć rozszerzonej tablicy znaków np. 'ö'
        int asciiValue;

        File file = new File(filePath);
        BufferedReader br = new BufferedReader(new FileReader(file));

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            try {
                line = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String str = sb.toString();

        if (str.isEmpty()) {
            return true;
        } else {
            for (int i = 0; i < str.length(); i++) {
                asciiValue = str.charAt(i);
                if (asciiValue > 255) {
                    return false;
                }
            }
        }
        return true;
    }
}
