class Pattern1 
{
   public static void main(String args[])
{
 int i, j, P;
for(i=1;i<=5;i++)
{
for(j=1;j<=5-i;j++)
{
System.out.print(" ");
}
P=i;
for(j=1;j<=i;j++)
{
System.out.print(P++);
}
P=P-2;
for(j=1;j<=i-1;j++)
{
System.out.print(P--);
}
System.out.println();
}
}
}
