#include <iostream>
using namespace std;


int findMaximum(int arr[], int size)
{
   int max = arr[0];
   for (int i = 1; i < size; i++)
   {
       if (arr[i] > max)
       {
           max = arr[i];
       }
   }
   return max;
}


int main()
{
   int num[5];
   cout << "Enter 5 numbers:" << endl;
   for (int i = 0; i < 5; i++)
   {
       cin >> num[i];
   }
   cout << "Maximum is " << findMaximum(num, 5) << endl;
   return 0;
}
