// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cas;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.cas.CertificateArgs;
import com.pulumi.alicloud.cas.inputs.CertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.cas.Certificate;
 * import com.pulumi.alicloud.cas.CertificateArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var cert = new Certificate(&#34;cert&#34;, CertificateArgs.builder()        
 *             .cert(Files.readString(Paths.get(String.format(&#34;%s/test.crt&#34;, path.module()))))
 *             .key(Files.readString(Paths.get(String.format(&#34;%s/test.key&#34;, path.module()))))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * @deprecated
 * This resource has been deprecated in favour of ServiceCertificate
 * 
 */
@Deprecated /* This resource has been deprecated in favour of ServiceCertificate */
@ResourceType(type="alicloud:cas/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * Cert of the Certificate in which the Certificate will add.
     * 
     */
    @Export(name="cert", type=String.class, parameters={})
    private Output<String> cert;

    /**
     * @return Cert of the Certificate in which the Certificate will add.
     * 
     */
    public Output<String> cert() {
        return this.cert;
    }
    @Export(name="certificateName", type=String.class, parameters={})
    private Output<String> certificateName;

    public Output<String> certificateName() {
        return this.certificateName;
    }
    /**
     * Key of the Certificate in which the Certificate will add.
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return Key of the Certificate in which the Certificate will add.
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    @Export(name="lang", type=String.class, parameters={})
    private Output</* @Nullable */ String> lang;

    public Output<Optional<String>> lang() {
        return Codegen.optional(this.lang);
    }
    /**
     * Name of the Certificate. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     * @deprecated
     * attribute &#39;name&#39; has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute &#39;certificate_name&#39; instead.
     * 
     */
    @Deprecated /* attribute 'name' has been deprecated from provider version 1.129.0 and it will be remove in the future version. Please use the new attribute 'certificate_name' instead. */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the Certificate. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or &#34;-&#34;, and must not begin or end with &#34;-&#34;, and &#34;-&#34; must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cas/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:cas/certificate:Certificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Certificate get(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}