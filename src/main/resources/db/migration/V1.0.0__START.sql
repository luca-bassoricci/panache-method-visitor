IF NOT EXISTS ( SELECT  *
                FROM    sys.schemas
                WHERE   name = N'postboot' )
    EXEC('CREATE SCHEMA [postboot]');

create sequence [postboot].[hibernate_sequence] start with 1 increment by 1;
CREATE TABLE [postboot].[product](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[code] [varchar](255) NULL,
	[marketArea] [varchar](255) NULL,
 CONSTRAINT [product_id_pkey] PRIMARY KEY CLUSTERED
(
	[id] ASC
) ON [PRIMARY]
) ON [PRIMARY];