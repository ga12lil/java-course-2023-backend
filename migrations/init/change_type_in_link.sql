ALTER TABLE link
    ALTER COLUMN updated_at TYPE TIMESTAMP WITH TIME ZONE
        USING updated_at AT TIME ZONE 'UTC';
ALTER TABLE link
    ALTER COLUMN last_check TYPE TIMESTAMP WITH TIME ZONE
        USING last_check AT TIME ZONE 'UTC';
