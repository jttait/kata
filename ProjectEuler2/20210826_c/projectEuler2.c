#include <assert.h>
#include <stdio.h>

void tests();
long sumEvenFibonacciNumbersBelow(long upperExclusive);

int main() {
   tests();
   return 0;
}

long sumEvenFibonacciNumbersBelow(long upperExclusive) {
   long sum = 0;
   long prevPrev = 0;
   long prev = 1;
   long next = prevPrev + prev;
   while (next < upperExclusive) {
      if (next % 2 == 0) {
         sum += next;
      }
      prevPrev = prev;
      prev = next;
      next = prevPrev + prev;
   }
   return sum;
}

void tests() {
   assert(0 == sumEvenFibonacciNumbersBelow(2));
   assert(2 == sumEvenFibonacciNumbersBelow(3));
   assert(2 == sumEvenFibonacciNumbersBelow(4));
   assert(44 == sumEvenFibonacciNumbersBelow(100));
   assert(4613732 == sumEvenFibonacciNumbersBelow(4000000));
}
