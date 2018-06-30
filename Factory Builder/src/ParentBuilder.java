abstract class ParentBuilder<T extends ParentBuilder<T>> {
	T withParentProperty(Long value) {
		getParent().setParentProperty(value);
		return getThis();
	}

	protected abstract ParentBase getParent();

	protected abstract T getThis();
}