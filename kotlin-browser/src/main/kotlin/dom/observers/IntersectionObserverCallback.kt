package dom.observers

import kotlinx.js.ReadonlyArray

typealias IntersectionObserverCallback = (
    entries: ReadonlyArray<IntersectionObserverEntry>,
    observer: IntersectionObserver,
) -> Unit
