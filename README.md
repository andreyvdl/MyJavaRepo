# java-lib42

## LibC part

- [X] isalpha
- [X] isdigit
- [X] isalnum
- [X] isascii
- [X] isprint
- [X] memset
- [X] bzero
- [ ] strlcpy
- [ ] strlcat
- [ ] toupper
- [ ] tolower
- [ ] strchr
- [ ] strrchr
- [ ] strncmp
- [ ] memchr
- [ ] memcmp
- [ ] strnstr
- [ ] atoi
- [ ] calloc
- [ ] strdup

## Utils functions part

- [ ] ft_substr
	- <details>
		<summary>info</summary>
		`char *ft_substr(char const *s, unsigned int start, size_t len);`<br>
		return: The substring. NULL if the allocation fails.<br>
		desc: Allocates and returns a substring from the string ’s’. The substring
		begins at index ’start’ and is of maximum size ’len’
	</details>
- [ ] ft_strjoin
	- <details>
		<summary>info</summary>
		`char *ft_strjoin(char const *s1, char const *s2);`<br>
		return: The new string. NULL if the allocation fails.<br>
		desc: Allocates and returns a new string, which is the result of the
		concatenation of ’s1’ and ’s2’.
	</details>
- [ ] ft_strtrim
	- <details>
		<summary>info</summary>
		`char *ft_strtrim(char const *s1, char const *set);`<br>
		return: The trimmed string. NULL if the allocation fails.<br>
		desc: Allocates and returns a copy of ’s1’ with the characters specified in
		’set’ removed from the beginning and the end of the string.
	</details>
- [ ] ft_split
	- <details>
		<summary>info</summary>
		`char **ft_split(char const *s, char c);`<br>
		return: The array of new strings resulting from the split. NULL if the
		allocation fails.<br>
		desc: Allocates and returns an array of strings obtained by splitting ’s’
		using the character ’c’ as a delimiter. The array must be ended by a NULL
		pointer.
	</details>
- [ ] ft_itoa
	- <details>
		<summary>info</summary>
		`char *ft_itoa(int n);`<br>
		return: The string representing the integer. NULL if the allocation fails.
		<br>
		desc: Allocates and returns a string representing the integer received as
		an argument. Negative numbers must be handled.
	</details>
- [ ] ft_strmapi
	- <details>
		<summary>info</summary>
		`char *ft_strmapi(char const *s, char (*f)(unsigned int, char));`<br>
		return: The string created from the successive applications of ’f’. Returns
		NULL if the allocation fails.<br>
		desc: Applies the function ’f’ to each character of the string ’s’ to create
		a new string resulting from successive applications of ’f’.
	</details>
- [ ] ft_striteri
	- <details>
		<summary>info</summary>
		`void ft_striteri(char *s, void (*f)(unsigned int, char *));`<br>
		return: None.<br>
		desc: Applies the function ’f’ to each character of the string ’s’ passed
		as argument, and passing its index as first argument. Each character is
		passed by address to ’f’ to be modified if necessary.
	</details>
- [ ] ft_putchar_fd
	- <details>
		<summary>info</summary>
		`void ft_putchar_fd(char c, int fd);`<br>
		return: None.<br>
		desc: Outputs the character ’c’ to the given file descriptor.
	</details>
- [ ] ft_putstr_fd
	- <details>
		<summary>info</summary>
		`void ft_putstr_fd(char *s, int fd);`<br>
		return: None.<br>
		desc: Outputs the string ’s’ to the given file descriptor.
	</details>
- [ ] ft_putendl_fd
	- <details>
		<summary>info</summary>
		`void ft_putendl_fd(char *s, int fd);`<br>
		return: None.<br>
		desc: Outputs the string ’s’ to the given file descriptor, followed by a
		newline.
	</details>
- [ ] ft_putnbr_fd
	- <details>
		<summary>info</summary>
		`void ft_putnbr_fd(int n, int fd);`<br>
		return: None.<br>
		desc: Outputs the integer ’n’ to the given file descriptor.
	</details>

## Linked List

Use this kind of list to receive any type inside your linkedList:
```java
List<Object> lst = new LinkedList<>();
```

- [ ] ft_lstnew
	- <details>
		<summary>info</summary>
		`t_list *ft_lstnew(void *content);`<br>
		return: The new element. NULL if the allocation fails.<br>
		desc: Allocates and returns a new element. The variable ’content’ is
		initialized with the value of the parameter ’content’. The variable ’next’
		is initialized to NULL.
	</details>
- [ ] ft_lstadd_front
	- <details>
		<summary>info</summary>
		`void ft_lstadd_front(t_list **lst, t_list *new);`<br>
		return: None.<br>
		desc: Adds the element ’new’ at the beginning of the list.
	</details>
- [ ] ft_lstsize
	- <details>
		<summary>info</summary>
		`int ft_lstsize(t_list *lst);`<br>
		return: Length of the list.<br>
		desc: Counts the number of elements in a list.
	</details>
- [ ] ft_lstlast
	- <details>
		<summary>info</summary>
		`t_list *ft_lstlast(t_list *lst);`<br>
		return: Last element of the list.<br>
		desc: Returns the last element of the list.
	</details>
- [ ] ft_lstadd_back
	- <details>
		<summary>info</summary>
		`void ft_lstadd_back(t_list **lst, t_list *new);`<br>
		return: None.<br>
		desc: Adds the element ’new’ at the end of the list.
	</details>
- [ ] ft_lstdelone
	- <details>
		<summary>info</summary>
		`void ft_lstdelone(t_list *lst, void (*del)(void*));`<br>
		return: None.<br>
		desc: Takes as a parameter an element and frees the memory of the element’s
		content using the function ’del’ given as a parameter and free the element.
		The memory of ’next’ must not be freed.
	</details>
- [ ] ft_lstclear
	- <details>
		<summary>info</summary>
		`void ft_lstclear(t_list **lst, void (*del)(void*));`<br>
		return: None.<br>
		desc: Deletes and frees the given element and every successor of that
		element, using the function ’del’ and free. Finally, the pointer to the
		list must be set to NULL.
	</details>
- [ ] ft_lstiter
	- <details>
		<summary>info</summary>
		`void ft_lstiter(t_list *lst, void (*f)(void *));`<br>
		return: None.<br>
		desc: Iterates the list ’lst’ and applies the function ’f’ to the content
		of each element.
	</details>
- [ ] ft_lstmap
	- <details>
		<summary>info</summary>
		`t_list *ft_lstmap(t_list *lst, void *(*f)(void *), void (*del)(void *));`<br>
		return: The new list. NULL if the allocation fails.<br>
		desc: Iterates the list ’lst’ and applies the function ’f’ to the content
		of each element. Creates a new list resulting of the successive applications
		of the function ’f’. The ’del’ function is used to delete the content of
		an element if needed.
	</details>
