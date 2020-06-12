The docs: https://clojuredocs.org/clojure.core/reductions

Returns a lazy seq of the intermediate values of the reduction (as
per reduce) of coll by f, starting with init.

## Favorite example from docs:

```
user=> (reductions + [1 1 1 1])
(1 2 3 4)
user=> (reductions + [1 2 3])
(1 3 6)
```

## When to use:

When the intermediate steps of the reduce are actually useful.

