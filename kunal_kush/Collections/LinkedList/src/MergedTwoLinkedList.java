//public class MergedTwoLinkedList {
//
//
//    public ListNode mergeTwoList(ListNode list1,ListNode list2){
//        ListNode first=first.head;
//        ListNode second=second.head;
//
//        ListNode ln= new ListNode();
//
//        while(first != null && second != null){
//            int i=0;
//            int j=0;
//            int k=0;
//            if(first[i]<second[j]){
//                ln[k]=first[i];
//                i++;
//            }else{
//                ln[k]=second[j];
//                j++;
//            }
//            k++;
//        }
//        while(first != null){
//            ln[k]=first[i];
//            i++;
//            k++;
//        }
//        while(second != null){
//            ln[k]=second[j];
//            j++;
//            k++;
//        }
//        return ln;
//    }
//}
