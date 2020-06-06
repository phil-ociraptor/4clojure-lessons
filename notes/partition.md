The docs: https://clojuredocs.org/clojure.core/partition

`(partition n coll) (partition n step coll) (partition n step pad coll)`

means to create a "collection of collections" where the size of each is `n`,
the step between partitions is `step` (makes sense with an example) and a
filler `pad` is provided if any partition isn't large enough.

## Favorite example from docs:

```
;; partition a list of 20 items into 5 (20/4) lists of 4 items
(partition 4 (range 20))
;;=> ((0 1 2 3) (4 5 6 7) (8 9 10 11) (12 13 14 15) (16 17 18 19))

;; partition a list of 22 items into 5 (20/4) lists of 4 items 
;; the last two items do not make a complete partition and are dropped.
(partition 4 (range 22))
;;=> ((0 1 2 3) (4 5 6 7) (8 9 10 11) (12 13 14 15) (16 17 18 19))

;; uses the step to select the starting point for each partition
(partition 4 6 (range 20))
;;=> ((0 1 2 3) (6 7 8 9) (12 13 14 15))

;; if the step is smaller than the partition size, items will be reused
(partition 4 3 (range 20))
;;=> ((0 1 2 3) (3 4 5 6) (6 7 8 9) (9 10 11 12) (12 13 14 15) (15 16 17 18))

;; when there are not enough items to fill the last partition, a pad can be supplied.
(partition 3 6 ["a"] (range 20))
;;=> ((0 1 2) (6 7 8) (12 13 14) (18 19 "a"))

;; when a pad is supplied, the last partition may not be of the same size as the rest
(partition 4 6 ["a"] (range 20))
;;=> ((0 1 2 3) (6 7 8 9) (12 13 14 15) (18 19 "a"))

;; but only as many pad elements are used as necessary to fill the final partition.
(partition 4 6 ["a" "b" "c" "d"] (range 20))
;;=> ((0 1 2 3) (6 7 8 9) (12 13 14 15) (18 19 "a" "b"))
```

## What I like:

Extremely useful to create "bins" of data. However, a similar cousin function
`partition-by` might be more useful in practice

