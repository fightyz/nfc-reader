package se.anyro.nfc_reader;

public final class SPEC {
	public enum PROP {
		ID(R.string.spec_prop_id);
		
		private final int resId;
		
		private PROP(int resId) {
			this.resId = resId;
		}
	}
}