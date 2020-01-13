# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class GetCiphertextResult:
    """
    A collection of values returned by getCiphertext.
    """
    def __init__(__self__, ciphertext_blob=None, encryption_context=None, key_id=None, plaintext=None, id=None):
        if ciphertext_blob and not isinstance(ciphertext_blob, str):
            raise TypeError("Expected argument 'ciphertext_blob' to be a str")
        __self__.ciphertext_blob = ciphertext_blob
        """
        The ciphertext of the data key encrypted with the primary CMK version.
        """
        if encryption_context and not isinstance(encryption_context, dict):
            raise TypeError("Expected argument 'encryption_context' to be a dict")
        __self__.encryption_context = encryption_context
        if key_id and not isinstance(key_id, str):
            raise TypeError("Expected argument 'key_id' to be a str")
        __self__.key_id = key_id
        if plaintext and not isinstance(plaintext, str):
            raise TypeError("Expected argument 'plaintext' to be a str")
        __self__.plaintext = plaintext
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        __self__.id = id
        """
        id is the provider-assigned unique ID for this managed resource.
        """
class AwaitableGetCiphertextResult(GetCiphertextResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetCiphertextResult(
            ciphertext_blob=self.ciphertext_blob,
            encryption_context=self.encryption_context,
            key_id=self.key_id,
            plaintext=self.plaintext,
            id=self.id)

def get_ciphertext(encryption_context=None,key_id=None,plaintext=None,opts=None):
    """
    Use this data source to access information about an existing resource.
    
    :param str key_id: The globally unique ID of the CMK.
           * `encryption_context` -
           (Optional) The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
    :param str plaintext: The plaintext to be encrypted which must be encoded in Base64.

    > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/kms_ciphertext.html.markdown.
    """
    __args__ = dict()

    __args__['encryptionContext'] = encryption_context
    __args__['keyId'] = key_id
    __args__['plaintext'] = plaintext
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = utilities.get_version()
    __ret__ = pulumi.runtime.invoke('alicloud:kms/getCiphertext:getCiphertext', __args__, opts=opts).value

    return AwaitableGetCiphertextResult(
        ciphertext_blob=__ret__.get('ciphertextBlob'),
        encryption_context=__ret__.get('encryptionContext'),
        key_id=__ret__.get('keyId'),
        plaintext=__ret__.get('plaintext'),
        id=__ret__.get('id'))