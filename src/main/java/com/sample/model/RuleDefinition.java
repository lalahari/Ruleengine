package com.sample.model;

import java.math.BigDecimal;

public class RuleDefinition {

	private String lefthandOperandModelPropertyName;
	private String righthandOperandModelPropertyName;
	private Operator operator;
	private BigDecimal righthandOperatorBD;
	private Integer righthandOperatorI;
	private String righthandOperatorS;
	private Boolean righthandOperatorB;


	public String getLefthandOperandModelPropertyName() {
		return lefthandOperandModelPropertyName;
	}

	public void setLefthandOperandModelPropertyName(String lefthandOperandModelPropertyName) {
		this.lefthandOperandModelPropertyName = lefthandOperandModelPropertyName;
	}

	public String getRighthandOperandModelPropertyName() {
		return righthandOperandModelPropertyName;
	}

	public void setRighthandOperandModelPropertyName(String righthandOperandModelPropertyName) {
		this.righthandOperandModelPropertyName = righthandOperandModelPropertyName;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public BigDecimal getRighthandOperatorBD() {
		return righthandOperatorBD;
	}

	public void setRighthandOperatorBD(BigDecimal righthandOperatorBD) {
		this.righthandOperatorBD = righthandOperatorBD;
	}

	public Integer getRighthandOperatorI() {
		return righthandOperatorI;
	}

	public void setRighthandOperatorI(Integer righthandOperatorI) {
		this.righthandOperatorI = righthandOperatorI;
	}

	public String getRighthandOperatorS() {
		return righthandOperatorS;
	}

	public void setRighthandOperatorS(String righthandOperatorS) {
		this.righthandOperatorS = righthandOperatorS;
	}

	public Boolean getRighthandOperatorB() {
		return righthandOperatorB;
	}

	public void setRighthandOperatorB(Boolean righthandOperatorB) {
		this.righthandOperatorB = righthandOperatorB;
	}

	public static class Builder {
		private String lefthandOperandModelPropertyName;
		private String righthandOperandModelPropertyName;
		private Operator operator;
		private BigDecimal righthandOperatorBD;
		private Integer righthandOperatorI;
		private String righthandOperatorS;
		private Boolean righthandOperatorB;

		public Builder lefthandOperandModelPropertyName(String lefthandOperandModelPropertyName) {
			this.lefthandOperandModelPropertyName = lefthandOperandModelPropertyName;
			return this;
		}

		public Builder righthandOperandModelPropertyName(String righthandOperandModelPropertyName) {
			this.righthandOperandModelPropertyName = righthandOperandModelPropertyName;
			return this;
		}

		public Builder operator(Operator operator) {
			this.operator = operator;
			return this;
		}

		public Builder righthandOperatorBD(BigDecimal righthandOperatorBD) {
			this.righthandOperatorBD = righthandOperatorBD;
			return this;
		}

		public Builder righthandOperatorI(Integer righthandOperatorI) {
			this.righthandOperatorI = righthandOperatorI;
			return this;
		}

		public Builder righthandOperatorS(String righthandOperatorS) {
			this.righthandOperatorS = righthandOperatorS;
			return this;
		}

		public Builder righthandOperatorB(Boolean righthandOperatorB) {
			this.righthandOperatorB = righthandOperatorB;
			return this;
		}

		public RuleDefinition build() {
			return new RuleDefinition(this);
		}
	}

	private RuleDefinition(Builder builder) {
		this.lefthandOperandModelPropertyName = builder.lefthandOperandModelPropertyName;
		this.righthandOperandModelPropertyName = builder.righthandOperandModelPropertyName;
		this.operator = builder.operator;
		this.righthandOperatorBD = builder.righthandOperatorBD;
		this.righthandOperatorI = builder.righthandOperatorI;
		this.righthandOperatorS = builder.righthandOperatorS;
		this.righthandOperatorB = builder.righthandOperatorB;
	}
}
