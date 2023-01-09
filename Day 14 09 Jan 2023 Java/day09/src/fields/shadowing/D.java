package fields.shadowing;

public class D extends B {
	int i = 66;

	int f() {
		return -i;
	}

	int superf() {
		return super.f();
	}

	int superi() {
		return super.i;
	}

	int bcasti() {
		return ((B) this).i;
	}
}