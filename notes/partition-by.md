The docs: https://clojuredocs.org/clojure.core/partition-by

`(partition-by f) (partition-by f coll)`

cuts the `coll` into smaller collections when the "partitioning function" 
returns a different value.

## Favorite example from docs:

```
user=> (partition-by #(= 3 %) [1 2 3 4 5])
((1 2) (3) (4 5))

user=> (partition-by odd? [1 1 1 2 2 3 3])
((1 1 1) (2 2) (3 3))

user=> (partition-by even? [1 1 1 2 2 3 3])
((1 1 1) (2 2) (3 3))
```

## What I like:

Useful when cutting up data into logical segments when *preserving order* is
desired.

