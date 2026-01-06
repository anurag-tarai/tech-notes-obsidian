1. Try to represent the problem in terms of index
2. Do all possible stuffs on that index according to problem statement
3. If Problem says
	- To find all the possible ways --> count all stuffs
	- find min -> min(all stuffs)
	- find max -> max(all stuffs)

### Example : Climb Stairs
n --> Number of stairs

Representing in terms of index
0, 1, 2, ...........n

for each index there is either take 1 step or 2 steps

Memoization - 
recurrence relations is `f(n) = f(n-1) + f(n-2)`;
Same as Fibonacci series!

