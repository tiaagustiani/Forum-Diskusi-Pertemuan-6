#include <iostream>
 
int main()
{
 
  int tinggi_segitiga,i,j;
 
  cout << "Input tinggi segitiga: ";
  cin >> tinggi_segitiga;
 
  cout << endl;
 
  for(i=1;i<=tinggi_segitiga;i++) {
    for(j=1;j<=i;j++) {
      cout << j <<" ";
    }
    cout << endl;
  }
 
  return 0;
}
