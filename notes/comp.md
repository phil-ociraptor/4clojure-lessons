The docs: https://clojuredocs.org/clojure.core/comp

(comp f g)

means to create a new function that would first apply g, and then f.

## Favorite example from docs:

```
(filter (comp not zero?) [0 1 0 2 0 3 0 4])
;;=> (1 2 3 4)
```

## What I like:

I think this is beautiful because it can vastly reduce nesting, and is both
economical in expression YET preserves human readability.

Terse and human == win.
