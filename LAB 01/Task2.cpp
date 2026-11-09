#include <iostream>
#include <string>
using namespace std;
struct Student
{
   string name;
   int rollNumber;
   float marks;
};
int main()
{
   Student st[3];
   for (int i = 0; i < 3; i++)
   {
       cout << "Enter name, roll number, and marks for student " << i + 1 << ":" << endl;
       cin >> st[i].name >> st[i].rollNumber >> st[i].marks;
   }
   for (int i = 0; i < 3; i++)
   {
       cout <<"Student "<< i + 1 << " details " << endl;
       cout << "Name : " << st[i].name << endl;
       cout << "Roll No : " << st[i].rollNumber << endl;
       cout << "Marks : " << st[i].marks << endl;
       cout << endl;
   }
   return 0;
}
