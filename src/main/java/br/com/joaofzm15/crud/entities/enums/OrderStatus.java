package br.com.joaofzm15.crud.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static OrderStatus returnTheOrderStatusThatCorespondsToTheParameterIntegerCode(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.code == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}

}
