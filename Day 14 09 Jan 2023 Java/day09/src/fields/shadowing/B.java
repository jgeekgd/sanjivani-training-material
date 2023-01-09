package fields.shadowing;

public class B {
	int i = 6;
	int f() {
		return i + i;
	}
}
