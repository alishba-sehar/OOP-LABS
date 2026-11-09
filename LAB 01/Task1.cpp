#include <iostream>
using namespace std;


float calculateAverage(int arr[], int size)
{
   int sum = 0;
   for (int i = 0; i < size; i++)
   {
       sum = sum + arr[i];
   }
   int average = sum / size ;
   return average;
}


int main()
{
   int size;
   cout << "Enter the size: ";
   cin >> size;


   int numbers[size];
   for (int i = 0; i < size; i++)
   {
       cout << "Enter element" << i + 1 << " :" << endl;
       cin >> numbers[i];
   }


   cout << "Average = " << calculateAverage(numbers, size) << endl;


   return 0;
}
