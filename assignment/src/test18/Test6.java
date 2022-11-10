package test18;

public class Test6 {
void print(int a) {
	int b=1;
	while(b<=a) {
		print2(b);
		b+=2;
	}
}void print2(int a){
	int b=1;
	for(int i=1;i<=3;i++) {
		b=b*a;
	}System.out.println(b);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Test6 sc=new Test6();
      sc.print(5);
	}

}
