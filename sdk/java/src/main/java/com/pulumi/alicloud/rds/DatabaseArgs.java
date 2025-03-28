// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseArgs Empty = new DatabaseArgs();

    /**
     * Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     * - PostgreSQL: Valid values for PostgreSQL databases: a value in the `character set,&lt;Collate&gt;,&lt;Ctype&gt;` format. Example: `UTF8,C,en_US.utf8`.
     * &gt; - Valid values for the character set : [ KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, SQL_ASCII ]
     * &gt; - Valid values for the Collate field: You can execute the `SELECT DISTINCT collname FROM pg_collation;` statement to obtain the field value. The default value is `C`.
     * &gt; - Valid values for the Ctype field: You can execute the `SELECT DISTINCT collctype FROM pg_collation;` statement to obtain the field value. The default value is `en_US.utf8`.
     * - MariaDB: [ utf8, gbk, latin1, utf8mb4 ]
     * 
     * More details refer to [API Docs](https://www.alibabacloud.com/help/zh/doc-detail/26258.htm)
     * 
     */
    @Import(name="characterSet")
    private @Nullable Output<String> characterSet;

    /**
     * @return Character set. The value range is limited to the following:
     * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
     * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
     * - PostgreSQL: Valid values for PostgreSQL databases: a value in the `character set,&lt;Collate&gt;,&lt;Ctype&gt;` format. Example: `UTF8,C,en_US.utf8`.
     * &gt; - Valid values for the character set : [ KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, SQL_ASCII ]
     * &gt; - Valid values for the Collate field: You can execute the `SELECT DISTINCT collname FROM pg_collation;` statement to obtain the field value. The default value is `C`.
     * &gt; - Valid values for the Ctype field: You can execute the `SELECT DISTINCT collctype FROM pg_collation;` statement to obtain the field value. The default value is `en_US.utf8`.
     * - MariaDB: [ utf8, gbk, latin1, utf8mb4 ]
     * 
     * More details refer to [API Docs](https://www.alibabacloud.com/help/zh/doc-detail/26258.htm)
     * 
     */
    public Optional<Output<String>> characterSet() {
        return Optional.ofNullable(this.characterSet);
    }

    /**
     * Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     * 
     * &gt; **NOTE:** The value of &#34;name&#34; or &#34;character_set&#34;  does not support modification.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
     * 
     * &gt; **NOTE:** The value of &#34;name&#34; or &#34;character_set&#34;  does not support modification.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Id of instance that can run database.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The Id of instance that can run database.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The name of the database.
     * * &gt; **NOTE:**
     * The name must be 2 to 64 characters in length.
     * The name must start with a lowercase letter and end with a lowercase letter or digit.
     * The name can contain lowercase letters, digits, underscores (_), and hyphens (-).
     * The name must be unique within the instance.
     * For more information about invalid characters, see [Forbidden keywords table](https://help.aliyun.com/zh/rds/developer-reference/forbidden-keywords?spm=api-workbench.api_explorer.0.0.20e15f16d1z52p).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the database.
     * * &gt; **NOTE:**
     * The name must be 2 to 64 characters in length.
     * The name must start with a lowercase letter and end with a lowercase letter or digit.
     * The name can contain lowercase letters, digits, underscores (_), and hyphens (-).
     * The name must be unique within the instance.
     * For more information about invalid characters, see [Forbidden keywords table](https://help.aliyun.com/zh/rds/developer-reference/forbidden-keywords?spm=api-workbench.api_explorer.0.0.20e15f16d1z52p).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private DatabaseArgs() {}

    private DatabaseArgs(DatabaseArgs $) {
        this.characterSet = $.characterSet;
        this.description = $.description;
        this.instanceId = $.instanceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseArgs $;

        public Builder() {
            $ = new DatabaseArgs();
        }

        public Builder(DatabaseArgs defaults) {
            $ = new DatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param characterSet Character set. The value range is limited to the following:
         * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
         * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
         * - PostgreSQL: Valid values for PostgreSQL databases: a value in the `character set,&lt;Collate&gt;,&lt;Ctype&gt;` format. Example: `UTF8,C,en_US.utf8`.
         * &gt; - Valid values for the character set : [ KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, SQL_ASCII ]
         * &gt; - Valid values for the Collate field: You can execute the `SELECT DISTINCT collname FROM pg_collation;` statement to obtain the field value. The default value is `C`.
         * &gt; - Valid values for the Ctype field: You can execute the `SELECT DISTINCT collctype FROM pg_collation;` statement to obtain the field value. The default value is `en_US.utf8`.
         * - MariaDB: [ utf8, gbk, latin1, utf8mb4 ]
         * 
         * More details refer to [API Docs](https://www.alibabacloud.com/help/zh/doc-detail/26258.htm)
         * 
         * @return builder
         * 
         */
        public Builder characterSet(@Nullable Output<String> characterSet) {
            $.characterSet = characterSet;
            return this;
        }

        /**
         * @param characterSet Character set. The value range is limited to the following:
         * - MySQL: [ utf8, gbk, latin1, utf8mb4 ] \(`utf8mb4` only supports versions 5.5 and 5.6\).
         * - SQLServer: [ Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN ]
         * - PostgreSQL: Valid values for PostgreSQL databases: a value in the `character set,&lt;Collate&gt;,&lt;Ctype&gt;` format. Example: `UTF8,C,en_US.utf8`.
         * &gt; - Valid values for the character set : [ KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, SQL_ASCII ]
         * &gt; - Valid values for the Collate field: You can execute the `SELECT DISTINCT collname FROM pg_collation;` statement to obtain the field value. The default value is `C`.
         * &gt; - Valid values for the Ctype field: You can execute the `SELECT DISTINCT collctype FROM pg_collation;` statement to obtain the field value. The default value is `en_US.utf8`.
         * - MariaDB: [ utf8, gbk, latin1, utf8mb4 ]
         * 
         * More details refer to [API Docs](https://www.alibabacloud.com/help/zh/doc-detail/26258.htm)
         * 
         * @return builder
         * 
         */
        public Builder characterSet(String characterSet) {
            return characterSet(Output.of(characterSet));
        }

        /**
         * @param description Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
         * 
         * &gt; **NOTE:** The value of &#34;name&#34; or &#34;character_set&#34;  does not support modification.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Database description. It cannot begin with https://. It must start with a Chinese character or English letter. It can include Chinese and English characters, underlines (_), hyphens (-), and numbers. The length may be 2-256 characters.
         * 
         * &gt; **NOTE:** The value of &#34;name&#34; or &#34;character_set&#34;  does not support modification.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param instanceId The Id of instance that can run database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The Id of instance that can run database.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param name The name of the database.
         * * &gt; **NOTE:**
         * The name must be 2 to 64 characters in length.
         * The name must start with a lowercase letter and end with a lowercase letter or digit.
         * The name can contain lowercase letters, digits, underscores (_), and hyphens (-).
         * The name must be unique within the instance.
         * For more information about invalid characters, see [Forbidden keywords table](https://help.aliyun.com/zh/rds/developer-reference/forbidden-keywords?spm=api-workbench.api_explorer.0.0.20e15f16d1z52p).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the database.
         * * &gt; **NOTE:**
         * The name must be 2 to 64 characters in length.
         * The name must start with a lowercase letter and end with a lowercase letter or digit.
         * The name can contain lowercase letters, digits, underscores (_), and hyphens (-).
         * The name must be unique within the instance.
         * For more information about invalid characters, see [Forbidden keywords table](https://help.aliyun.com/zh/rds/developer-reference/forbidden-keywords?spm=api-workbench.api_explorer.0.0.20e15f16d1z52p).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public DatabaseArgs build() {
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("DatabaseArgs", "instanceId");
            }
            return $;
        }
    }

}
