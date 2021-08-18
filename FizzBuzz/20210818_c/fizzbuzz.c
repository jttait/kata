#include <stdio.h>
#include <assert.h>
#include <string.h>

void fizzbuzz(int number, char* str);
int tests();

int main() {
   tests();
   return 0;
}

void fizzbuzz(int number, char* str) {
   if (number % 3 == 0 && number % 5 == 0) {
      strcpy(str, "fizzbuzz");
   } else if (number % 3 == 0) {
      strcpy(str, "fizz");
   } else if (number % 5 == 0) {
      strcpy(str, "buzz");
   } else {
      sprintf(str, "%d", number);
   }
}

int tests() {
   char str[99];
   fizzbuzz(1, str);
   assert(strcmp(str, "1") == 0);
   fizzbuzz(3, str);
   assert(strcmp(str, "fizz") == 0);
   fizzbuzz(5, str);
   assert(strcmp(str, "buzz") == 0);
   fizzbuzz(15, str);
   assert(strcmp(str, "fizzbuzz") == 0);
   return 0;
}


