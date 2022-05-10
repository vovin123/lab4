import java.util.Scanner;
public class SVCĐN extends nguoi{
    protected double ĐTB ;
    protected int TĐKT,SMKT, ĐTKTHP;
    Scanner sc = new Scanner(System.in);

        public void tinhdiem(){
            System.out.print( "nhap TĐKT: ");
            TĐKT =sc.nextInt();
            System.out.print( "nhap SMKT: ");
            SMKT =sc.nextInt();
            System.out.print( "nhap ĐTKTHP: ");
            ĐTKTHP =sc.nextInt();
            ĐTB = (Double)(((double)(TĐKT / SMKT) + ĐTKTHP)/ 3);
            System.out.println( "Điểm trung bình : ");
        }}
