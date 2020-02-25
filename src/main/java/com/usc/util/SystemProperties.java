package com.usc.util;

public final class SystemProperties
{
	/**
	 * Java 运行时环境版本
	 */
	public static final String JAVA_VERSION = "java.version";
	/**
	 * Java 运行时环境供应商
	 */
	public static final String JAVA_VENDOR = "java.vendor";
	/**
	 * Java 供应商的 URL
	 */
	public static final String JAVA_VENDOR_URL = "java.vendor.url";
	/**
	 * Java 安装目录
	 */
	public static final String JAVA_HOME = "java.home";
	/**
	 * Java 虚拟机规范版本
	 */
	public static final String JAVA_VM_SPECIFICATION_VERSION = "java.vm.specification.version";
	/**
	 * Java 虚拟机规范供应商
	 */
	public static final String JAVA_VM_SPECIFICATION_VENDOR = "java.vm.specification.vendor";
	/**
	 * Java 虚拟机规范名称
	 */
	public static final String JAVA_VM_SPECIFICATION_NAME = "java.vm.specification.name";
	/**
	 * Java 虚拟机实现版本
	 */
	public static final String JAVA_VM_VERSION = "java.vm.version";
	/**
	 * Java 虚拟机实现供应商
	 */
	public static final String JAVA_VM_VENDOR = "java.vm.vendor";
	/**
	 * Java 虚拟机实现名称
	 */
	public static final String JAVA_VM_NAME = "java.vm.name";
	/**
	 * Java 运行时环境规范版本
	 */
	public static final String JAVA_SPECIFICATION_VERSION = "java.specification.version";
	/**
	 * Java 运行时环境规范供应商
	 */
	public static final String JAVA_SPECIFICATION_VENDOR = "java.specification.vendor";
	/**
	 * Java 运行时环境规范名称
	 */
	public static final String JAVA_SPECIFICATION_NAME = "java.specification.name";
	/**
	 * Java 类格式版本号
	 */
	public static final String JAVA_CLASS_VERSION = "java.class.version";
	/**
	 * Java 类路径
	 */
	public static final String JAVA_CLASS_PATH = "java.class.path";
	/**
	 * 加载库时搜索的路径列表
	 */
	public static final String JAVA_LIBRARY_PATH = "java.library.path";
	/**
	 * 默认的临时文件路径
	 */
	public static final String JAVA_IO_TMPDIR = "java.io.tmpdir";
	/**
	 * 要使用的 JIT 编译器的名称
	 */
	public static final String JAVA_COMPILER = "java.compiler";
	/**
	 * 一个或多个扩展目录的路径
	 */
	public static final String JAVA_EXT_DIRS = "java.ext.dirs";
	/**
	 * 操作系统名称
	 */
	public static final String OS_NAME = "os.name";
	/**
	 * 操作系统架构
	 */
	public static final String OS_ARCH = "os.arch";
	/**
	 * 操作系统版本
	 */
	public static final String OS_VERSION = "os.version";
	/**
	 * 文件名分隔符(在 UNIX 系统中是"/")
	 */
	public static final String FILE_SEPARATOR = "file.separator";
	/**
	 * 路径分隔符(在 UNIX 系统中是".")
	 */
	public static final String PATH_SEPARATOR = "path.separator";

	/**
	 * 行分隔符(在 UNIX 系统中是"/n")
	 */
	public static final String LINE_SEPARATOR = "line.separator";
	/**
	 * 用户的账户名称
	 */
	public static final String USE_NAME = "user.name";
	/**
	 * 用户的主目录
	 */
	public static final String USER_HOME = "user.home";
	/**
	 * 用户的当前工作目录
	 */
	public static final String USER_DIR = "user.dir";

	public static String getJAVA_VERSION()
	{
		return System.getProperty(JAVA_VERSION);
	}

	public static String getJAVA_VENDOR()
	{
		return System.getProperty(JAVA_VENDOR);
	}

	public static String getJAVA_VENDOR_URL()
	{
		return System.getProperty(JAVA_VENDOR_URL);
	}

	public static String getJAVA_HOME()
	{
		return System.getProperty(JAVA_HOME);
	}

	public static String getJAVA_VM_SPECIFICATION_VERSION()
	{
		return System.getProperty(JAVA_VM_SPECIFICATION_VERSION);
	}

	public static String getJAVA_VM_SPECIFICATION_VENDOR()
	{
		return System.getProperty(JAVA_VM_SPECIFICATION_VENDOR);
	}

	public static String getJAVA_VM_SPECIFICATION_NAME()
	{
		return System.getProperty(JAVA_VM_SPECIFICATION_NAME);
	}

	public static String getJAVA_VM_VERSION()
	{
		return System.getProperty(JAVA_VM_VERSION);
	}

	public static String getJAVA_VM_VENDOR()
	{
		return System.getProperty(JAVA_VM_VENDOR);
	}

	public static String getJAVA_VM_NAME()
	{
		return System.getProperty(JAVA_VM_NAME);
	}

	public static String getJAVA_SPECIFICATION_VERSION()
	{
		return System.getProperty(JAVA_SPECIFICATION_VERSION);
	}

	public static String getJAVA_SPECIFICATION_VENDOR()
	{
		return System.getProperty(JAVA_SPECIFICATION_VENDOR);
	}

	public static String getJAVA_SPECIFICATION_NAME()
	{
		return System.getProperty(JAVA_SPECIFICATION_NAME);
	}

	public static String getJAVA_CLASS_VERSION()
	{
		return System.getProperty(JAVA_CLASS_VERSION);
	}

	public static String getJAVA_CLASS_PATH()
	{
		return System.getProperty(JAVA_CLASS_PATH);
	}

	public static String getJAVA_LIBRARY_PATH()
	{
		return System.getProperty(JAVA_LIBRARY_PATH);
	}

	public static String getJAVA_IO_TMPDIR()
	{
		return System.getProperty(JAVA_IO_TMPDIR);
	}

	public static String getJAVA_COMPILER()
	{
		return System.getProperty(JAVA_COMPILER);
	}

	public static String getJAVA_EXT_DIRS()
	{
		return System.getProperty(JAVA_EXT_DIRS);
	}

	public static String getOS_NAME()
	{
		return System.getProperty(OS_NAME);
	}

	public static String getOS_ARCH()
	{
		return System.getProperty(OS_ARCH);
	}

	public static String getOS_VERSION()
	{
		return System.getProperty(OS_VERSION);
	}

	public static String getFILE_SEPARATOR()
	{
		return System.getProperty(FILE_SEPARATOR);
	}

	public static String getPATH_SEPARATOR()
	{
		return System.getProperty(PATH_SEPARATOR);
	}

	public static String getLINE_SEPARATOR()
	{
		return System.getProperty(LINE_SEPARATOR);
	}

	public static String getUSE_NAME()
	{
		return System.getProperty(USE_NAME);
	}

	public static String getUSER_HOME()
	{
		return System.getProperty(USER_HOME);
	}

	public static String getUSER_DIR()
	{
		return System.getProperty(USER_DIR);
	}

}
