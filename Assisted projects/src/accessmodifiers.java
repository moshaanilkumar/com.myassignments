
public class accessmodifiers {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

					a b=new a();
					b.msg();
					b c= new b();
					c.chat();
				}
	}

			class a {
				public void msg() {
					System.out.println("hello anil, how are you ?");
				}
			}
			class b{
				
				protected void chat() {
					System.out.println("you dont have the permission to access the chat");
				}
				
			}
		




