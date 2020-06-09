The docs: https://clojuredocs.org/clojure.core/partition-all

`(partition-all n step coll)`

Just like partition, except that there is no "pad" option. It's equivalent to
`(partition n step nil coll)`

Sort of like a partition that always "pads" things with `nil`.

## Favorite example from docs:

```
```

## What I like:

A bit cleaner to do 
`(partition-all 2 2 [1 2 3 4 5 6])` 
than 
`(partition 2 2 nil [1 2 3 4 5 6])` 

Even though they are equivalent.
