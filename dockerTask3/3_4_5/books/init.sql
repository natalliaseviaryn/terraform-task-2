create table public.books (
		id serial primary key,
		title varchar(255) not null,
		author varchar(255) not null
);

insert into books (title, author) values
('The Great Gatsby', 'F. Scott Fitzgerald'),
('To Kill a Mockingbird', 'Harper Lee'),
('1984', 'George Orwell'),
('Clan Dominance: The Sleepless Ones', 'Dem Mikhailov'),
('The Catcher in the Rye', 'J.D. Salinger'),
('The Grapes of Wrath', 'John Steinbeck'),
('The Lord of the Rings', 'J.R.R. Tolkien'),
('The Hobbit', 'J.R.R. Tolkien');