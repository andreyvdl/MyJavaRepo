package libft;

class LibftC {
	public static boolean ftIsAlpha(int c) {
		return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
	}

	public static boolean ftIsDigit(int c) {
		return (c >= '0' && c <= '9');
	}

	public static boolean ftIsAlNum(int c) {
		return ((LibftC.ftIsAlpha(c) || LibftC.ftIsDigit(c)));
	}

	public static boolean ftIsAscii(int c) {
		return (c >= 0 && c <= 127);
	}

	public static boolean ftIsPrint(int c) {
		return (c >= ' ' && c <= '~');
	}

	public static <T> T[] ftMemSet(T[] array, T fill, int len) {
		if (len < 0)
			return (array);
		for (int i = 0; i < len; i++)
			array[i] = fill;
		return (array);
	}

	public static <T> void ftBZero(T[] array, int len) {
		if (len < 0)
			return ;
		for (int i = 0; i < len; i++)
			array[i] = null;
	}
}
