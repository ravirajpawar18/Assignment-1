import java.util.*;
import java.io.*;

class Node
{
int data;
Node next;

Node(int value)
{
this.data=value;
this.next=null;
}
}

public class Link
{
Node head=null;
//Insert at begin
void InsertatBegin(int value)
{
Node newnode=new Node(value);
if (head==null)
{
head=newnode;
return;
}
newnode.next=head;
head=newnode;
}

//Insert at end
void InsertatEnd(int value)
{
Node newnode=new Node(value);
if(head==null)
{
head=newnode;
return;
}
Node temp = head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=newnode;
}

//Insert at position
void InsertatPosition(int value,int pos)
{
Node newnode =new Node(value);
if(pos==1)
{
InsertatBegin(value);
}
Node temp=head;
while(int i=0;i<pos-1 && temp!=null;i++)
{
temp=temp.next;
}
if(temp==null)
{ Sysyem.out.print("Position out of range ");}
newnode.next=temp.next;
temp.next=newnode;
}

//Delete at Begin
void DeleteatBegin()
{
if(head==null)
{System.out.print("List is empty!");}
Node temp=head;
head=temp.next;
}

//Delete from end
void DeletefromEnd()
{
if(head==null)
{System.out.println("List is empty!");}
Node temp=head;
while(temp.next!=null)
{temp=temp.next;}
temp.next=null;
}

//Delete from position
void DeletefromPosition(int pos)
{
if(pos==1)
{
 DeleteatBegin();
}
Node temp=head;
while(int i=0;i<pos-1 && temp.next!=null;i++)
{
temp=temp.next;
}
if(temp.next==null)
{System.out.print("Position out of range");}
Node del=temp.next;
temp.next=del.next;

} 
}

public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
do
{
System.out.println("1.Insert at begin \n 2.Insert at End \n 3.Insert at position \n 4.Delete from begin \n 5.Delete from End \n 6.Delete from position \n 7.Display");
int ch=sc.nextInt();
switch(ch)
{
case 1:
Insert at begin();
break;
case 2:
Insert at end();
break;
case 3:
Insert at position ();
break;
case 4:
Delete from begin ();
break;
case 5:
Delete from end();
break;
case 6:
Delete from position();
break;
case 7:
Display();
break;
}
}while();
}