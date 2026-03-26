package minor_projects;
import java.util.Scanner;

public class URL_Parser {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String url = null;
        System.out.println("Enter the website url:");
        url = sc.nextLine();


        int index0 = url.indexOf(':');
        String protocol = url.substring(0,index0);
        if(protocol.equals("http")){
            System.out.println("Protocol : Hyper text transfer protocol");
        } else if (protocol.equals("https")) {
            System.out.println("Protocol : Hyper text transfer protocol secure");
        }else if (protocol.equals("ftp")) {
            System.out.println("Protocol : File transfer protocol");
        } else if (protocol.equals("smtp")) {
            System.out.println("Protocol : Simple mail transfer protocol ");
        }
        else{
            System.out.println("Unknown protocol");
        }


        int index1 = url.lastIndexOf('.');
        String extension = url.substring(index1 + 1);
        if(extension.equals("com")){
            System.out.println("Extension : Commercial website");
        }
        else if (extension.equals("org")) {
            System.out.println("Extension : Organisation website");
        }
        else if (extension.equals("net")) {
            System.out.println("Extension : Network website");
        }
        else if (extension.equals("gov")) {
            System.out.println("Extension : Government website");
        }
        else if (extension.equals("biz")) {
            System.out.println("Extension : Business website");
        }
        else{
            System.out.println("Unknown Domain type");
        }


        int index2 = url.indexOf('.');
        String domain = url.substring(index2+1,index1);
        System.out.println("Website name : "+domain);
    }
}