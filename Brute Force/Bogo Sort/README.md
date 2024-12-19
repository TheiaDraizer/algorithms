# Bogo Sort

Bogo Sort is a highly inefficient sorting algorithm that randomly shuffles the array until it is sorted. It works by checking if the array is sorted and, if not, randomly permuting the elements. This process repeats until the array is sorted, making it one of the worst sorting algorithms in terms of performance.

## Complexity
| Name      | Best   | Average  | Worst   | Memory | Stable | Comments             |
|-----------|--------|----------|---------|--------|--------|----------------------|
| BogoSort  | n      | (n+1)!   | (n+1)!  | 1      | No     | Extremely inefficient |

## References
- [Wikipedia](https://en.wikipedia.org/wiki/Bogosort)
