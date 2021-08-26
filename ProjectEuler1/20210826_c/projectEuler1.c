#include <assert.h>
#include <stdio.h>

void tests();
int sumMultiplesOf3or5below(int upperExclusive);

int main() {
   tests();
   return 0;
}

int sumMultiplesOf3or5below(int upperExclusive) {
   int sum = 0;
   for (int i = 1; i < upperExclusive; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
         sum += i;
      }
   }
   return sum;
}

void tests() {
   assert(3 == sumMultiplesOf3or5below(4));
   assert(3 == sumMultiplesOf3or5below(5));
   assert(8 == sumMultiplesOf3or5below(6));
   assert(23 == sumMultiplesOf3or5below(10));
   assert(233168 == sumMultiplesOf3or5below(1000));
}
