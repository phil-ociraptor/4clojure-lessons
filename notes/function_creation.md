This is a famiily of functions that create other functions.

The most common one is `defn`: https://clojuredocs.org/clojure.core/defn

Which is really an alias for: `(def name (fn [params* ] exprs*))`

That means the true building block is `fn`: https://clojuredocs.org/clojure.core/fn

There are some common creational functions:

- `identity`   - which is presumably just `fn [x] x`
- `constantly` - which creates a function that just returns a constant  

## What I like:

Getting familiar with `identity` and `constantly` sound like niche uses, but
those are just examples of generality that look really nice.

