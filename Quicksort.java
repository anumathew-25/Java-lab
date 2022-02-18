package day6;
import java.util.Scanner;

public class Quicksort {
String names[];
int length;
public static void main(String [] args)
{
Quicksort obj = new Quicksort();
Scanner sc = new Scanner(System.in);
System.out.println("\t\t---QuickSort---\n");
System.out.println("Enter the number of names : ");
int num = sc.nextInt();
String input[] = new String[num];
System.out.println("Enter the names : ");
for (int i = 0; i < input.length; i++) {
input[i] = sc.next();
//sc.next();
}
obj.sort(input);
for (String i : input) {
System.out.print(i);
System.out.print(" ");
}
sc.close();
}

void sort(String array[]) {
if (array == null || array.length == 0) {
return;
}
this.names = array;
this.length = array.length;
quickSort(0, length - 1);
}

void quickSort(int lowerIndex, int higherIndex) {
int i = lowerIndex;
int j = higherIndex;
String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

while (i <= j) {
while (this.names[i].compareToIgnoreCase(pivot) < 0) {
i++;
}

while (this.names[j].compareToIgnoreCase(pivot) > 0) {
j--;
}

if (i <= j) {
swap(i, j);
i++;
j--;
}
}
if (lowerIndex < j) {
quickSort(lowerIndex, j);
}
if (i < higherIndex) {
quickSort(i, higherIndex);
}
}

void swap(int i, int j) {
String temp = this.names[i];
this.names[i] = this.names[j];
this.names[j] = temp;
}
}