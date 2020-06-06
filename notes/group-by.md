The docs: https://clojuredocs.org/clojure.core/group-by

`(group-by f coll)`

creates a map keyed by the "grouping-function" `f`, and where the value is a
collection of all elements that are keyed to `f`

## Favorite example from docs:

```
;; group strings by their length
(group-by count ["a" "as" "asd" "aa" "asdf" "qwer"])
;;=> {1 ["a"], 2 ["as" "aa"], 3 ["asd"], 4 ["asdf" "qwer"]}

;; group integers by a predicate
(group-by odd? (range 10))
;;=> {false [0 2 4 6 8], true [1 3 5 7 9]}
```

## What I like:

Extremely useful to group things. Not to be confused by `partition-by`
