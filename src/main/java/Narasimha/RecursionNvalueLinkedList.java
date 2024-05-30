package Narasimha;


class LinkedListt{
    int value;
    LinkedListt next;
    LinkedListt(int value){
        this.value=value;
    }
}
public class RecursionNvalueLinkedList {
    private static LinkedListt result=null;

    public static void main(String[] args) {
        LinkedListt list=new LinkedListt(1);
        list.next=new LinkedListt(2);
        list.next.next=new LinkedListt(3);
        list.next.next.next=new LinkedListt(4);
        list.next.next.next.next=new LinkedListt(5);
        list.next.next.next.next.next=new LinkedListt(11);
        LinkedListt kk=list.next.next.next.next.next;


        RecursionNvalueLinkedList resul=new RecursionNvalueLinkedList();
       resul.result(list,6);
        System.out.println(result.value);
        resul.reverse(list);
        list.next=null;
        while (kk!=null){
            System.out.println(kk.value);
            kk=kk.next;
        }

    }

    public int result(LinkedListt source,int index){
        if (source==null){
            return 1;
        }
        int val=result(source.next,index);
        if (val==index){
            result=source;
        }
        return val+1;
    }


    public void reverse(LinkedListt present){
        recurseReturn(present);
        present.next=null;
    }
    public LinkedListt recurseReturn(LinkedListt present){
        if (present.next ==null){
            return present;
        }
       LinkedListt x= recurseReturn(present.next);
        x.next=present;

        return present;
    }
}
