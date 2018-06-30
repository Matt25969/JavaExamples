final class Child1Builder extends ParentBuilder<Child1Builder> {
	public Child1Builder() {
		pending_ = new ConcreteChild1();
	}

	public Child1Builder withChild1Property(Integer value) {
		pending_.setChild1Property(value);
		return this;
	}

	@Override
	protected ParentBase getParent() {
		return pending_;
	}

	@Override
	protected Child1Builder getThis() {
		return this;
	}

	private final ConcreteChild1 pending_;
}