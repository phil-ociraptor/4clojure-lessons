The docs: https://clojuredocs.org/clojure.core/into

`(into to from)`

Successively conj items in `from` "into" `to`


## Favorite example from docs:

```
user=> (into () '(1 2 3))
(3 2 1)

; Behavior of conj is different for vectors:
user=> (into [1 2 3] '(4 5 6))
[1 2 3 4 5 6]
```

```
; Change from one type of map to another
user=> (into (sorted-map) {:b 2 :c 3 :a 1})
{:a 1, :b 2, :c 3}
```

## When to use:

A good usecase seems to be transforming from one data type to another, if you
desire the conj behavior.


