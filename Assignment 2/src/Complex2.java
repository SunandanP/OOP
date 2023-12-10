//Java Class having an ability to store 1 complex number per object.
public class Complex2 {
    private float real;
    private float img;
    Complex2(float real,float img){
        this.real = real;
        this.img = img;
    }
    void setData(float real, float img){
        this.real = real;
        this.img = img;
    }

    Complex2 add(Complex2 complex){
        Complex2 c2 = new Complex2(0,0);
        c2.real = real + complex.real;
        c2.img = img + complex.img;
        return c2;

    }


    Complex2 sub(Complex2 complex){
        Complex2 c2 = new Complex2(0,0);
        c2.real = real - complex.real;
        c2.img = img - complex.img;
        return c2;

    }
    Complex2 multiply(Complex2 complex){
        Complex2 c2 = new Complex2(0,0);
        c2.real = (real * complex.real) - (img * complex.img);
        c2.img = (real * complex.img) + (img * complex.real);
        return c2;

    }

    Complex2 divide(Complex2 complex){
        Complex2 c2 = new Complex2(0,0);
        float[] conjugate = new float[2];
        conjugate[0] = real;
        conjugate[1] = -img;
        float deno = ((complex.real*complex.real)+(complex.img*complex.img));

        float[] multi = new float[4];
        multi[0] = real * complex.real;
        multi[1] = real * complex.img;
        multi[2] = complex.real * img;
        multi[3] = img * complex.img;

        c2.real = (multi[0] + multi[3])/deno;
        c2.img = (-multi[1] + multi[2])/deno;
        return c2;
    }
    void display(){
        System.out.println("The complex number is "+real+(img == 0?"": ((img > 0)? "+":"-")+((img < 0)?-img:img)+"i"));
    }
    void swap(Complex2 complex){
        float[] temp = new float[2];
        temp[0] = real;
        temp[1] = img;
        real = complex.real;
        img = complex.img;
        complex.real = temp[0];
        complex.img = temp[1];
    }
}
