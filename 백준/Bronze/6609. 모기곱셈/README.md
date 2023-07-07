# [Bronze II] 모기곱셈 - 6609 

[문제 링크](https://www.acmicpc.net/problem/6609) 

### 성능 요약

메모리: 26836 KB, 시간: 396 ms

### 분류

사칙연산, 구현, 수학, 시뮬레이션

### 문제 설명

<p>Have you ever wondered why there are so many mosquitos in wet environments? One of the reasons is that adult female mosquitos can lay as many as hundreds of eggs. Even if most of them do not (fortunately!) survive, it is said that a single pair of mosquitos can generate a population of thousands in just a couple of weeks. Let us have a closer look at these numbers.</p>

<p>The mosquito life cycle includes four stages: egg, larva, pupa, and adult. For simplicity, we will make several assumptions that are not quite true in the nature: The egg stage lasts less than one day, and all the other stages are one week long. Each mosquito lives as a larva for the first week, the second week “hibernates” in the form of a pupa, and finally, the third week lives as an adult mosquito. At the end of its three-week life, each mosquito lays eggs and dies.</p>

<p>To simplify things even further, we will assume that the transformation from one life stage into another always happens on Sunday. Each Sunday, the following things happen:</p>

<ul>
	<li>An adult mosquito lays E eggs and dies. Within a day, one larva hatches from each egg.</li>
	<li>Some of the larvae hatched from egg the last Sunday were not strong enough and died or got eaten. Only every R-th larva will transform into a pupa on Sunday.</li>
	<li>An adult mosquito emerges from every S-th pupa, all other pupae dry.</li>
</ul>

<p>For example, if there are 5 pupae and every 3-rd of them survives, there will be 1 mosquito left. Out of 6 pupae, two adult mosquitos emerge.</p>

<p>In the first week, there are M mosquitos, P pupae and L larvae. Calculate how many mosquitos will there be after N Sunday transformations. Of course, we are counting only living adult mosquitos, not the dry dead bodies.</p>

### 입력 

 <p>The input consists of several instances, each instance per one line. Each line contains seven integers M, P, L, E, R, S, N separated by space. M, P and L are the numbers of mosquitos, pupae, and larvae, respectively, in the first week. You may assume that 0 ≤ M, P,L ≤ 100 000, 0 ≤ E ≤ 100, 1 ≤ R, S ≤ 10, and 1 ≤ N ≤ 1000. E is the number of eggs laid by one mosquito, R and S specify the survival rates of larvae and pupae, and N is the number of weeks.</p>

### 출력 

 <p>For each input instance, output a single line containing an integer number C, giving the count of mosquitos after the N-th Sunday.</p>

<p>You may assume that the number of mosquitos during each of the first N weeks will not exceed 1 000 000.</p>

