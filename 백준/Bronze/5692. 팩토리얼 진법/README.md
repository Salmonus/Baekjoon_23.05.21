# [Bronze III] 팩토리얼 진법 - 5692 

[문제 링크](https://www.acmicpc.net/problem/5692) 

### 성능 요약

메모리: 31256 KB, 시간: 620 ms

### 분류

사칙연산, 수학

### 문제 설명

<p>Mathew, an engineering freshman, is developing an original positional notation for representing integer numbers. He called it “A Curious Method” (ACM for short). The ACM notation uses the same digits as the decimal notation, i.e., 0 through 9.</p>

<p>To convert a number A from ACM to decimal notation you must add k terms, where k is the number of digits of A (in the ACM notation). The value of the i-th term, corresponding the i-th digit ai, counting from right to left, is a<sub>i</sub> × i!. For instance 719ACM is equivalent to 5310, since 7 × 3! + 1 × 2! + 9 × 1! = 53.</p>

<p>Mathew has just begun studying number theory, and probably does not know which properties a numbering system should have, but at the moment he is only interested in converting a number from ACM to decimal. Could you help him?</p>

### 입력 

 <p>Each test case is given in a single line that contains a non-empty string of at most 5 digits, representing a number in ACM notation. The string does not have leading zeros.</p>

<p>The last test case is followed by a line containing one zero.</p>

### 출력 

 <p>For each test case output a single line containing the decimal representation of the corresponding ACM number.</p>

