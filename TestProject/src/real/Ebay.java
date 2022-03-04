///*
//Given an array of characters arr = ['a', 'b', 'c', 'a' ,d'].
//
//Return a list of integers representing the lengths of all subsequences such that the same character cannot be a part of two subsequences.
//
//Example 1:
//
//Input : arr = ['a', 'b', 'c', 'a' ,d']
//Output : [4, 1]
//exp: a =0 and a =3
//so words abca, d
//
//Example 2:
//Input:
//arr = ['a', 'b', 'c','d'].
//Output: [1,1,1,1]
//
//
//Example 3:
//Input: ['a', 'b','c', 'd', 'b', 'd', 'e']
//Output: [1, 5, 1]
//exampel: a, bcdbd, e
//
//example 4: Input: [a,a,b,a,b,c]
//output:[5,1]
//
//
//[
//a- 0,1,3
//b-2, 4
//c-5
//]
//a-0,3
//b-2,4
//c-5,5
//*/
////b.start < a.end
////        b.end > a.end
////        a.end = b.end
////        b.delete
////
////        a - 0, 4
////        c -5,5
//
//public List<Integer> getLengths(List<Character> arr) {
//
//        Map<Character,List<Integer>> letters = new HashMap();
//        foreach(int i=0;i<arr.size();i++) {
//        if(letters.contains(element)) {
//        letters.put(elemtent, letters.get(element).add(i))
//        }
//        else{
//        List list = new ArrayList();
//        list.add(i);
//        letters.put(elemtent, list);
//        }
//        }
//
//        letters.keys.
//
//
//        //    foreach(int i=0;i<arr.size();i++) {
//        //      foreach( int j=i+1;j<arr.size();j++){
//        //        if(arr[i] == )
//        //      }
//
//        //      if(letters.get(element) == 1){
//        //        System.out.println("1");
//        //      }
//        //      else if(letters.get(element).equals(tempChar)) {
//        //        System.out.println(tempChar.length)
//        //      }
//        //      else {
//        //        //tempChar = element;
//        //        temp = temp + element;
//        //      }
//
//        }
//
//        }
