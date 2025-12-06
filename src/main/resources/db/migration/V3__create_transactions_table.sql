create table transactions (
    transaction_id serial primary key,
    account_id integer not null,
    operation_type_id integer not null,
    amount numeric(19,2) not null,
    event_date timestamp not null default current_timestamp,
    constraint fk_account foreign key(account_id) references accounts(account_id),
    constraint fk_operation_type foreign key(operation_type_id) references operation_types(operation_type_id)
);
