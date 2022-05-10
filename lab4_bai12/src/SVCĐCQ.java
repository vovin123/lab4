import java.util.Scanner;

public class SVCĐCQ extends nguoi{
    protected double ĐTB ;
    protected int TĐKT,SMKT, ĐTKTHP;
    Scanner sc = new Scanner(System.in);

        public void tinhdiem(){
            System.out.print( "nhap TĐKT: ");
            TĐKT =sc.nextInt();
            System.out.print( "nhap SMKT: ");
            SMKT =sc.nextInt();
            ĐTB = (double)(TĐKT / SMKT) ;
            System.out.println( "Điểm trung bình : ");
        }}
    