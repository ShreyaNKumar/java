package practice3;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class NonCommonElements {
//    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3};
//        int[] nums2 = {2, 4, 6};
//
//        int[][] result = findNonCommonElements(nums1, nums2);
//
//        // Display the result
//        for (int i = 0; i < result.length; i++) {
//            System.out.println(Arrays.toString(result[i]));
//        }
//    }
//
//    public static int[][] findNonCommonElements(int[] nums1, int[] nums2) {
//        List<Integer> nonCommonList1 = new ArrayList<>();
//        List<Integer> nonCommonList2 = new ArrayList<>();
//
//        // Find elements not common in nums1
//        for (int num : nums1) {
//            if (!contains(nums2, num)) {
//                nonCommonList1.add(num);
//            }
//        }
//
//        // Find elements not common in nums2
//        for (int num : nums2) {
//            if (!contains(nums1, num)) {
//                nonCommonList2.add(num);
//            }
//        }
//
//        // Convert lists to arrays
//        int[] nonCommonArray1 = nonCommonList1.stream().mapToInt(Integer::intValue).toArray();
//        int[] nonCommonArray2 = nonCommonList2.stream().mapToInt(Integer::intValue).toArray();
//
//        // Construct the result multidimensional array
//        int[][] result = {nonCommonArray1, nonCommonArray2};
//
//        return result;
//    }
//
//    private static boolean contains(int[] arr, int target) {
//        for (int num : arr) {
//            if (num == target) {
//                return true;
//            }
//        }
//        return false;
//    }
//}







//class Array{
//	public static void main(String[] args) {
//		int a1[]={1,2,3};
//		int a2[]={2,4,6};
//		int o1[]=new int[3];
//		int o2[]=new int[3];
//		int i,j,k=0,l=0,count1,count2;
//
//		for(i=0;i<3;++i){
//			count1=0;
//			count2=0;
//			for(j=0;j<3;++j){
//				if(a1[i]==a2[j]){  //comparing elements in a1 not in a2
//					count1++;
//				}
//				if(a2[i]==a1[j]){  //comparing elements in a2 not in a1
//					count2++;
//				}
//			}
//			if(count1==0){
//				o1[k]=a1[i];      //updating in first output array
//				++k;
//			}
//			if(count2==0){
//				o2[l]=a2[i];	  //updating in second output array
//				++l;
//			}
//		}
//		
//		
//		System.out.print("1st Output array: ");
//		for(i=0;i<3;++i){
//			if(o1[i]==0){
//				continue;
//			}
//			System.out.print(o1[i]+" ");
//		}
//
//		System.out.print("\n2nd Output array: ");
//		for(i=0;i<3;++i){
//			if(o2[i]==0){
//				continue;
//			}
//			System.out.print(o2[i]+" ");
//		}
//		System.out.println();
//	}
//}







//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class Array {
//    public static void main(String[] args) {
//        int[] arr1 = {4,9,5};
//        int[] arr2 = {9,4,9,8,4};
//
//        int[] commonElements = findCommonElements(arr1, arr2);
//
//        // Display the result
//        System.out.print("[");
//        for (int i = 0; i < commonElements.length; i++) {
//            System.out.print(commonElements[i]);
//            if (i < commonElements.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//
//    public static int[] findCommonElements(int[] arr1, int[] arr2) {
//        Map<Integer, Integer> countMap = new HashMap<>();
//        List<Integer> commonElementsList = new ArrayList<>();
//
//        // Count occurrences in arr1
//        for (int num : arr1) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Check common elements with repetition in arr2
//        for (int num : arr2) {
//            if (countMap.containsKey(num) && countMap.get(num) > 0) {
//                commonElementsList.add(num);
//                countMap.put(num, countMap.get(num) - 1);
//            }
//        }
//
//        // Convert list to array
//        int[] commonElements = new int[commonElementsList.size()];
//        for (int i = 0; i < commonElementsList.size(); i++) {
//            commonElements[i] = commonElementsList.get(i);
//        }
//
//        return commonElements;
//    }
//}
//






//public class Array {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[] = {16,17,4,3,5,2};
//		int i, j;
//		for(i=0;i<a.length;i++){
//			for(j=i+1;j<a.length;j++) {
//				if(a[i]<=a[j]) 
//					break;
//
//			
//			}
//			if(j==a.length) {
//					System.out.print(a[i]+" ");
//			}
//			
//		}
//
//    }
//
//}






//import java.util.*;  
//import java.util.Scanner;
//import java.util.ArrayList;
//
//
//public class Array8 
//	{
//
//		public static void main(String[] args) 
//		{
//			TreeSet<Character> list = new TreeSet<Character>();
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter string: ");
//			String s = input.next();
//			for(char ch : s.toCharArray())
//				list.add(ch);
//			for(char ch : list)
//				System.out.print(ch);
//			System.out.print("\nSize of substring: " + list.size());
//		}
//	}



