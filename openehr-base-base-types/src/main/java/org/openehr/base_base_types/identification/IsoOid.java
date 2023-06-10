package org.openehr.base_base_types.identification;

/**
 * Model of ISO's Object Identifier (oid) as defined by the standard ISO/IEC 8824. Oids are formed from integers separated by dots. Each non-leaf node in an Oid starting from the left corresponds to an assigning authority, and identifies that authority's namespace, inside which the remaining part of the identifier is locally unique.
 */
public interface IsoOid extends Uid {
}
