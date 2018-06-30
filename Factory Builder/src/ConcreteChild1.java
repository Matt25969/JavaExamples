final class ConcreteChild1 extends ParentBase implements Child1 {
	@Override
	public Integer getChild1Property() {
		return childProperty_;
	}

	public void setChild1Property(Integer value) {
		childProperty_ = value;
	}

	private Integer childProperty_;
}