abstract class ParentBase implements Parent {

	private Long parentProperty_;

	@Override
	public final Long getParentProperty() {
		return parentProperty_;
	}

	protected void setParentProperty(Long value) {
		parentProperty_ = value;
	}

}